package com.kwazamchess.model;

public abstract class ChessPiece {
    protected Position position; // Current position of the piece
    protected String colour;     // Colour of the piece ("Blue" or "Red")

    // Constructor
    public ChessPiece(Position position, String colour) {
        this.position = position;
        this.colour = colour;
    }

    // Abstract method: Each piece will implement its own valid move logic
    public abstract boolean isValidMove(Position target);

    // Move method to update the position
    public boolean move(Position target) {
        if (isValidMove(target)) {
            this.position = target;
            return true;
        }
        return false;
    }

    // Getters and Setters
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
