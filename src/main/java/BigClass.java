public class BigClass {
    private String text;
    private int number;

    public BigClass(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public BigClass(String text) {
        this(0,text);
    }
    public BigClass(int number) {
        this(number, null);
    }
    public BigClass() {
        this(null);
    }
    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        }else {
            System.out.println("Fel input. The number cannot be negative.");
        }
    }
    public int getNumber() {
        return number;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    //ska vara en String och en return-statement istället för void
    public String uppercase() {
        this.text = this.text.toUpperCase();
        return text;
    }

    //ska vara en String och en return-statement
    public String changToNull() {
        this.text = null;
        return null;
    }

    public int add(int newNumber) {
        if (newNumber >= 0) {
            this.number = newNumber + this.number;
        }else {
            System.out.println("Fel input. The new number cannot be negative.");
        }
        return this.number;
    }
    @Override
    public String toString() {
        return "BigClass{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }


}