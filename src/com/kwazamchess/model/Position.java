package com.kwazamchess.model;

public class Position {
    private int x;
    private int y;

    // Constructor
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Equals method to compare two positions
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return x == position.x && y == position.y;
    }

    // For debugging purposes
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
