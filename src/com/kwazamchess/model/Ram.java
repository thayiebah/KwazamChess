package com.kwazamchess.model;

public class Ram extends ChessPiece {

    public Ram(Position position, String colour) {
        super(position, colour);
    }

    @Override
    public boolean isValidMove(Position target) {
        // Ram can only move forward one step
        int direction = colour.equalsIgnoreCase("Blue") ? 1 : -1;

        // Check if the target is exactly one step forward
        return target.getX() == position.getX() + direction && target.getY() == position.getY();
    }
}
