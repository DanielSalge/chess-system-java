package boardgame;

public class Board {

    private Integer row;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer row, Integer columns) {
        this.row = row;
        this.columns = columns;
        pieces = new Piece[row][columns];
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int columns) {
        return pieces[row][columns];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
