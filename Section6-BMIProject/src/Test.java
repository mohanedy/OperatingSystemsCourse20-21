public class Test {
    public static void main(String[] args) {
        BMI myBmi = new BMI("Ahmed",70,1.75);
        System.out.println(myBmi.getBMI());
        System.out.println(myBmi.getStatus());
    }
}

class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this.name = name;

        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if(bmi < 18.5){
            return  "Underweight";
        }else  if(bmi < 25){
            return  "Normal";
        }else if(bmi <= 30){
            return  "Overweight";
        }else {
            return  "Very Overweight";
        }
    }


}