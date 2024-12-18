package com.kwazamchess.model;

/*
 * Represents a position on the Kwazam Chess board.
 * The Position class stores the x (row) and y (column) coordinates
 * and provides utility methods for comparison and representation.
 * Author: Thayiebah
 * Date: 19/12/2024
 */

public class Position {
    private int row;    //Represents the (x-coordinate)
    private int column; //Represents the (y-coordinate)

    /*
     * Constructs a Position with the specified row and column.
     * 
     * @param row   The row coordinate (x);
     * @param column The column coordinate (y);
     */
    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    /*
     * Retrieves the row coordinate of the position.
     * 
     * @return The row value.
     */
    public int getRow() {return row;}

    /*
     * Retrieves the column coordinate of the position.
     * 
     * @return The column value.
     */
    public int getColumn() {return column;}

    /*
     * Checks if two Position objects are equal based on their coordinates.
     * 
     * @param obj The object to compare with this Position.
     * @return True if the positions have the same row and column, false otherwise.
     */
    @Override
    public boolean equals (Object obj){
        if (this == obj) {
            return true;    // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;   // Different types or null
        }
        Position otherPosition = (Position) obj;
        return row == otherPosition.row && column == otherPosition.column;  // Coordinate comparison
    }

    /*
     * Returns a string representation of the Position for easy debugging.
     * 
     * @return A formatted string representing the position.
     */
    @Override
    public String toString(){
        return String.format("Position[row=%d, column=%d]", row, column);
    }
}
