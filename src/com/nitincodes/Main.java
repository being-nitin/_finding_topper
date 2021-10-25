package com.nitincodes;

/*Design an application in java that contains a class Student having
        properties name and percentage. Create a class Test that declares
        three instances of Student class. The values are passed through constructor at the time of its object creation.
        The output should be the name and percentage of the topper.

 */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Nitin",97);
        Student s2 = new Student("Rahul",99);
        Student s3 = new Student("Nitish",96);
        if(s1.percentage> s2.percentage){
            if(s1.percentage>s3.percentage){
                s1.topper();
            }
            else{
                s3.topper();
            }
        }
        else{
            if(s2.percentage> s3.percentage){
                s2.topper();
            }
            else{
                s3.topper();
            }
        }

    }
}
class Student{
    String name;
    float percentage;
    Student(String sName, int sPercentage){
        this.name = sName;
        this.percentage = sPercentage;
    }
    void topper(){
        System.out.println(name+" is the topper ");
    }
}
