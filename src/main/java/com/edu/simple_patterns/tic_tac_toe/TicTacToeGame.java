package com.edu.simple_patterns.tic_tac_toe;

import java.awt.*;

public class TicTacToeGame extends Game {
    private boolean isGameStopped;
    private int[][] model = new int[3][3];
    private int currentPlayer;

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        startGame();
        updateView();
    }

    public void startGame() {
        isGameStopped = false;
        currentPlayer = 1;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                model[x][y] = 0;
            }
        }
    }

    public void updateView() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                updateCellView(x, y, model[x][y]);
            }
        }
    }

    public void updateCellView(int x, int y, int value) {
        if (value == 1) {
            setCellValueEx(x, y, Color.WHITE, "X", Color.RED);
        } else if (value == 2) {
            setCellValueEx(x, y, Color.WHITE, "O", Color.BLUE);
        } else {
            setCellValueEx(x, y, Color.WHITE, " ", Color.WHITE);
        }
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            return;
        }
        if (model[x][y] != 0) {
            return;
        }
        model[x][y] = currentPlayer;
        updateView();
        currentPlayer = 3 - currentPlayer; // 2 <--> 1
    }
}
