package gr.aueb.cf.ch11.model;

/**
 * The{@link Point} class represents <i>points</i> in
 * a two-dimension space. It contains {@link Point#x} and
 * {@link Point#y} coordinates.
 *
 * @author Dimi
 * @since 0.1
 * @version 2.0
 */

public class Point {
    private int x;
    private int y;

    /**
     * Initialize a new {@link Point}
     * with default values.
     */

    public Point() {
    }

    /**
     * Initialize a newly created point to
     * specific coordinates.
     * @param x  the x-coordinate.
     * @param y  the y coordinate.
     */

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate.
     *
     * @return the value of {@link Point#x} coordinate.
     */

    public int getX() {
        return x;
    }

    /**
     * Sets  the {@link Point#y} coordinate
     *
     * @param x    The value of x-coordinates.
     */

    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * Gets the {@link Point#y}  coordinate.
     *
     * @return      the valuew of y-coordinate.
     */

    public int getY() {
        return y;
    }

    /**Sets the {@link Point#y} coordinate.
     *
     * @param y     the value of y-coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the state of {@link Point} instance
     * as a {@link String}
     *
     * @return a string representation of {@link Point}
     *          instance.
     */
    public String pointToString() {
        return "(" + x + "," + y + ")";
    }
}

