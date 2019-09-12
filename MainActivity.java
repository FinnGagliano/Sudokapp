ackage com.example.finn.sudokapp;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p003v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Random;

public class MainGame extends AppCompatActivity {
    private static boolean restart = false;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public ArrayAdapter f34ad;
    /* access modifiers changed from: private */
    public int[] colour = new int[81];
    /* access modifiers changed from: private */
    public String[] display = new String[81];
    /* access modifiers changed from: private */
    public boolean[] fixedCells = new boolean[81];
    private int[][] grid = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{9, 9}));
    /* access modifiers changed from: private */
    public GridView gridDisplay;
    private String[][] numSet = ((String[][]) Array.newInstance(String.class, new int[]{9, 9}));
    private int[] solvedGrid = new int[81];

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0323R.layout.activity_main_game);
        Button btn1 = (Button) findViewById(C0323R.C0325id.btn1);
        Button btn2 = (Button) findViewById(C0323R.C0325id.btn2);
        Button btn3 = (Button) findViewById(C0323R.C0325id.btn3);
        Button btn4 = (Button) findViewById(C0323R.C0325id.btn4);
        Button btn5 = (Button) findViewById(C0323R.C0325id.btn5);
        Button btn6 = (Button) findViewById(C0323R.C0325id.btn6);
        Button btn7 = (Button) findViewById(C0323R.C0325id.btn7);
        Button btn8 = (Button) findViewById(C0323R.C0325id.btn8);
        Button btn9 = (Button) findViewById(C0323R.C0325id.btn9);
        Button btnClear = (Button) findViewById(C0323R.C0325id.btnClear);
        final int[] selectedCellPos = new int[1];
        createSudoku();
        this.gridDisplay = (GridView) findViewById(C0323R.C0325id.gridDisplay);
        this.f34ad = new ArrayAdapter<String>(this, C0323R.layout.support_simple_spinner_dropdown_item, this.display) {
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                view.setBackgroundColor(MainGame.this.getColour(position));
                return view;
            }
        };
        this.gridDisplay.setAdapter(this.f34ad);
        this.gridDisplay.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                MainGame.this.gridDisplay.getChildAt(selectedCellPos[0]).setBackgroundColor(MainGame.this.getColour(selectedCellPos[0]));
                selectedCellPos[0] = position;
                if (MainGame.this.colour[selectedCellPos[0]] == 0) {
                    MainGame.this.gridDisplay.getChildAt(selectedCellPos[0]).setBackgroundColor(Color.parseColor("#c2d6d6"));
                } else {
                    MainGame.this.gridDisplay.getChildAt(selectedCellPos[0]).setBackgroundColor(Color.parseColor("#85adad"));
                }
            }
        });
        btnClear.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = " ";
                    MainGame.this.f34ad.notifyDataSetChanged();
                }
            }
        });
        btn1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "1";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "2";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "3";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "4";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "5";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn6.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "6";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn7.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "7";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn8.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "8";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
        btn9.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!MainGame.this.fixedCells[selectedCellPos[0]]) {
                    MainGame.this.display[selectedCellPos[0]] = "9";
                    MainGame.this.f34ad.notifyDataSetChanged();
                    if (MainGame.this.checkIfSolved()) {
                        MainGame.this.solvedAlert();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public boolean checkIfSolved() {
        for (int i = 0; i < 81; i++) {
            if (!Objects.equals(this.display[i], Integer.toString(this.solvedGrid[i]))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public int getColour(int position) {
        if (this.colour[position] == 0) {
            return Color.parseColor("#b3cccc");
        }
        return Color.parseColor("#669999");
    }

    /* access modifiers changed from: 0000 */
    public void solvedAlert() {
        Builder builder = new Builder(this);
        builder.setMessage("Solved! Wanna play again?").setCancelable(true).setPositiveButton("Yeah!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                MainGame.this.resetSudoku();
                MainGame.this.createSudoku();
                MainGame.this.f34ad.notifyDataSetChanged();
            }
        }).setNegativeButton("Nope", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                MainGame.this.startActivity(new Intent(MainGame.this, Menu.class));
            }
        });
        builder.create().show();
    }

    /* access modifiers changed from: 0000 */
    public void resetSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.numSet[i][j] = "123456789";
                this.grid[i][j] = 0;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void editNumSetInSquare(int xStart, int yStart, int selectedNum) {
        for (int i = xStart; i < xStart + 3; i++) {
            for (int j = yStart; j < yStart + 3; j++) {
                this.numSet[i][j] = this.numSet[i][j].replace(String.valueOf(selectedNum), "");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void createSudoku() {
        boolean gridIsBad;
        Random rand = new Random();
        resetSudoku();
        do {
            gridIsBad = false;
            int x = 0;
            while (true) {
                if (x >= 9) {
                    break;
                }
                int y = 0;
                while (true) {
                    if (y >= 9) {
                        break;
                    } else if (this.numSet[x][y].length() == 0) {
                        gridIsBad = true;
                        break;
                    } else {
                        int selectedNum = Integer.parseInt(String.valueOf(this.numSet[x][y].charAt(rand.nextInt(this.numSet[x][y].length()))));
                        this.grid[x][y] = selectedNum;
                        this.numSet[x][y] = "filled";
                        for (int i = 0; i < 9; i++) {
                            this.numSet[i][y] = this.numSet[i][y].replace(String.valueOf(selectedNum), "");
                        }
                        for (int j = 0; j < 9; j++) {
                            this.numSet[x][j] = this.numSet[x][j].replace(String.valueOf(selectedNum), "");
                        }
                        int k = (y * 9) + x;
                        if (x < 3) {
                            if (y < 3) {
                                editNumSetInSquare(0, 0, selectedNum);
                                this.colour[k] = 0;
                            } else if (y <= 2 || y >= 6) {
                                editNumSetInSquare(0, 6, selectedNum);
                                this.colour[k] = 0;
                            } else {
                                editNumSetInSquare(0, 3, selectedNum);
                                this.colour[k] = 1;
                            }
                        } else if (x <= 2 || x >= 6) {
                            if (y < 3) {
                                editNumSetInSquare(6, 0, selectedNum);
                                this.colour[k] = 0;
                            } else if (y <= 2 || y >= 6) {
                                editNumSetInSquare(6, 6, selectedNum);
                                this.colour[k] = 0;
                            } else {
                                editNumSetInSquare(6, 3, selectedNum);
                                this.colour[k] = 1;
                            }
                        } else if (y < 3) {
                            editNumSetInSquare(3, 0, selectedNum);
                            this.colour[k] = 1;
                        } else if (y <= 2 || y >= 6) {
                            editNumSetInSquare(3, 6, selectedNum);
                            this.colour[k] = 1;
                        } else {
                            editNumSetInSquare(3, 3, selectedNum);
                            this.colour[k] = 0;
                        }
                        y++;
                    }
                }
                if (gridIsBad) {
                    resetSudoku();
                    continue;
                    break;
                }
                x++;
            }
        } while (gridIsBad);
        createDisplay();
    }

    /* access modifiers changed from: 0000 */
    public void createDisplay() {
        int i = 0;
        Random rand = new Random();
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (rand.nextInt(2) == 0) {
                    this.display[i] = String.valueOf(this.grid[x][y]);
                    this.fixedCells[i] = true;
                } else {
                    this.display[i] = " ";
                    this.fixedCells[i] = false;
                }
                this.solvedGrid[i] = this.grid[x][y];
                i++;
            }
        }
    }
}
