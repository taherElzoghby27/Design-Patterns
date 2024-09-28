package com.mycompany.designpatterns.command_pattern.snake_game.receiver;

public class Snake {

    protected int[][] board;
    protected int x;
    protected int y;

    public Snake(int xBoard, int yBoard) {
        this.board = new int[xBoard][yBoard];
        x = y = 0;
        resetBoard();
        getPosition();
        showBoard();
    }

    public void moveRight() {
        if (y == board.length - 1) {
            System.out.println("Not Available");
        } else {
            if (this.board[x][y] != 0) {
                --this.board[x][y];
            }
            ++y;
            ++this.board[x][y];
        }
        getPosition();
        showBoard();
    }

    public void moveLeft() {
        if (y == 0) {
            System.out.println("Not Available");
        } else {
            if (this.board[x][y] != 0) {
                --this.board[x][y];
            }
            --y;
            ++this.board[x][y];
        }
        getPosition();
        showBoard();
    }

    public void moveTop() {
        if (x == 0) {
            System.out.println("Not Available");
        } else {
            if (this.board[x][y] != 0) {
                --this.board[x][y];
            }
            --x;
            ++this.board[x][y];
        }
        getPosition();
        showBoard();
    }

    public void moveBottom() {
        if (x == this.board.length-1) {
            System.out.println("Not Available");
        } else {
            if (this.board[x][y] != 0) {
                --this.board[x][y];
            }
            ++x;
            ++this.board[x][y];
        }
        getPosition();
        showBoard();
    }

    private void getPosition() {
        System.out.println("Position : (" + x + " , " + y + ")");
    }

    private void showBoard() {
        for (int x = 0; x < this.board.length; x++) {
            for (int y = 0; y < this.board.length; y++) {
                System.out.print(this.board[x][y] + " ");
            }
            System.out.println("");
        }
    }

    private void resetBoard() {
        for (int x = 0; x < this.board.length; x++) {
            for (int y = 0; y < this.board.length; y++) {
                this.board[x][y] = 0;
            }
        }
    }
}
