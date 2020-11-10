package model;

public class Calculator {

    private String numberString = "";
    private Double result;
    private boolean sum;
    private boolean subtraction;
    private boolean multiplication;
    private boolean division;
    private boolean resultIsShowing;

    // Métodos publicos
    public String getNumberString() {
        return formatedNumber(this.numberString);
    }

        // Comandos teclado numérico
    public void addNumber(String number) {
        if (this.resultIsShowing) {
            this.numberString = "";
        }
        boolean enterPressed = false;
        if (enterPressed) {
            this.result = null;
        }
        this.numberString = this.numberString + number;
    }

    public void removeNumber() {
        try {
            this.numberString = this.numberString.substring(0, this.numberString.length() - 1);
        }catch (Exception ignored) {}
    }

    public void clearNumberString() {
        this.numberString = "0";
    }

    public void cancelEntry() {
        this.numberString = "";
        this.result = null;

        this.sum = false;
        this.subtraction = false;
        this.multiplication = false;
        this.division = false;
    }

    public void enter() {
        doOperation();
        try {
            this.numberString = formatedNumber(this.result.toString());
        } catch (Exception ignored) {}
    }

    public void sumButtom() {
        doOperation();
        this.sum = true;
    }

    public void subtractionButtom() {
        doOperation();
        this.subtraction = true;
    }

    public void multiplicationButtom() {
        doOperation();
        this.multiplication = true;
    }

    public void divisionButtom() {
        doOperation();
        this.division = true;
    }

    // Métodos privados
    private String formatedNumber(final String number) {
        try {
            return String.format(getAmountOfDecimalNumbers(number), Double.parseDouble(number));
        } catch (Exception ignored) {
            return "0";
        }
    }

    private String getAmountOfDecimalNumbers(final String number) {
        try {
            return "%,." + (this.verifyAmountOfDecimalNumbers(number)) + "f";
        }catch (Exception ignored) {
            return "%,.0f";
        }
    }

    private int verifyAmountOfDecimalNumbers(final String number) {
        if (Integer.parseInt(number.split("\\.")[1]) != 0) {
            return number.split("\\.")[1].split("").length;
        }
        return 0;
    }

    private void doOperation() {
        if (this.result != null) {

            if (sum){
                this.result = this.result + Double.parseDouble(this.numberString);
            } else if (subtraction) {
                this.result = this.result - Double.parseDouble(this.numberString);
            } else if (multiplication) {
                this.result = this.result * Double.parseDouble(this.numberString);
            } else if (division) {
                this.result = this.result / Double.parseDouble(this.numberString);
            }

            resultIsShowing = true;
            sum = false;
            subtraction = false;
            multiplication = false;
            division = false;

            this.numberString = formatedNumber(this.result.toString());
        } else {
            try {
                this.result = Double.parseDouble(this.numberString);
                this.numberString = "";
            }catch (Exception ignored) {
                this.numberString = "";
            }
        }
    }
}
