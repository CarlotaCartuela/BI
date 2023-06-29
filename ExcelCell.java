package org.example.excelfactory;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;

public class ExcelCell {

    private Object valor;
    private CellType type;
    private boolean bold = false;
    private short fontSize = 10;
    private VerticalAlignment verticalAlignment = VerticalAlignment.CENTER;
    private HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEFT;
    private boolean locked = false;

    public ExcelCell(Object valor, CellType type) {
        this.valor = valor;
        this.type = type;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public boolean isBold() {
        return bold;
    }

    public ExcelCell setBold(boolean bold) {
        this.bold = bold;
        return this;
    }

    public short getFontSize() {
        return fontSize;
    }

    public ExcelCell setFontSize(short fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public VerticalAlignment getVerticalAlignment() {
        return verticalAlignment;
    }

    public ExcelCell setVerticalAlignment(VerticalAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public ExcelCell setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
        return this;
    }

    public boolean isLocked() {
        return locked;
    }

    public ExcelCell setLocked(boolean locked) {
        this.locked = locked;
        return this;
    }
}
