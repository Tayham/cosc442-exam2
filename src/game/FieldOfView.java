package game;

public class FieldOfView {
	private World world;
	private int depth;

	private boolean[][] visible;

	public boolean isVisible(int x, int y, int z) {
		return axisLogicCheck(x, y, z) && visibilityCheck(x, y);
	}

	/**
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	private boolean axisLogicCheck(int x, int y, int z) {
		return z == depth && x >= 0 && y >= 0;
	}

	private boolean visibilityCheck(int x, int y) {
		return x < visible.length && y < visible[0].length && visible[x][y];
	}

	private Tile[][][] tiles;

	public Tile tile(int x, int y, int z) {
		return tiles[x][y][z];
	}

	public FieldOfView(World world) {
		this.world = world;
		this.visible = new boolean[world.width()][world.height()];
		this.tiles = new Tile[world.width()][world.height()][world.depth()];

		for (int x = 0; x < world.width(); x++) {
			for (int y = 0; y < world.height(); y++) {
				for (int z = 0; z < world.depth(); z++) {
					tiles[x][y][z] = Tile.UNKNOWN;
				}
			}
		}
	}

	public void update(int world_x, int world_y, int world_z, int r) {
		depth = world_z;
		visible = new boolean[world.width()][world.height()];

		for (int x = -r; x < r; x++) {
			for (int y = -r; y < r; y++) {

				if (fieldOfViewCheck(x, y, r))
					continue;

				if (worldCheck(x, y, world_x, world_y))
					continue;

				for (Point p : new Line(world_x, world_y, world_x + x, world_y + y)) {
					Tile tile = world.tile(p.x, p.y, world_z);
					visible[p.x][p.y] = true;
					tiles[p.x][p.y][world_z] = tile;

					if (!tile.isGround())
						break;
				}
			}
		}
	}

	private boolean fieldOfViewCheck(int x, int y, int r) {
		if (x * x + y * y > r * r)
			return true;
		return false;
	}

	private boolean worldCheck(int x, int y, int world_x, int world_y) {
		if (world_x + x < 0 || world_x + x >= world.width() || world_y + y < 0 || world_y + y >= world.height())
			return true;
		return false;
	}
}
