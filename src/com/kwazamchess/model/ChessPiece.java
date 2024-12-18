package com.kwazamchess.model;

/**
 * An abstract class representing a chess piece on the Kwazam Chess Board.
 * It provides shared attributes like position and colour, and methods for movement.
 * Author: Thayiebah
 * Date: 19/12/2024
 */
public abstract class ChessPiece {
    protected Position position;    
    protected String colour;

    /**
     * Constructs a ChessPiece with its position and colour
     * 
     * @param position The initial position of the chess piece.
     * @param colour The colour of the chess piece.
     */
    public ChessPiece(Position position, String colour){
        this.position = position;
        this.colour = colour;
    }

    /**
     * Determines if a move to the target position is valid.
     * This method is abstract and must be implemented by subclasses.
     * 
     * @param target The traget position to move to.
     * @return True if the move is valid, false otherwise.
     */
    public abstract boolean isValidMove(Position target);

    /**
     * Moves the piece to the specified target position if the move is valid.
     * 
     * @param target The position to move the piece to.
     * @return True if the move was successful, false otherwise.
     */
    public boolean move(Position target){
        if (isValidMove(target)){
            this.position = target; // Update the position
            return true;    // Move successful
        }
        return false;   //Invalid move
    }

    /**
     * Retrieves the current position of the chess piece.
     * 
     * @return The position of the piece.
     */
    public Position getPosition(){
        return position;
    }

    /**
     * Updates the position of the chess piece.
     * 
     *  @param position The new position to set.
     */
    public void setPosition(Position position){
        this.position = position;
    }

    /**
     * Retrieves the colour of the chess piece.
     * 
     * @return The colour of the piece.
     */
    public String getColour(){
        return colour;
    }

    /**
     * Sets the colour of the chess piece.
     * 
     * @param colour The colour to set.
     */
    public void setColour(String colour){
        this.colour = colour;
    }
}
