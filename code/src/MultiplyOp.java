/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zhangshuting
 */
public class MultiplyOp implements Operator{
    Operator op1,op2;
    private double num1,num2;
    int way;
    public MultiplyOp(double n1, double n2) {
        num1=n1;
        num2=n2;
        way=1;
    }
    public MultiplyOp(Operator op,double n){
        num1=op.run();
        num2=n;
        op1=op;
        way=2;
    }
    public MultiplyOp(double n,Operator op){
        num1=n;
        num2=op.run();
        op2=op;
        way=3;
    }
    public MultiplyOp(Operator o1,Operator o2){
        num1=o1.run();
        num2=o2.run();
        op1=o1;
        op2=o2;
        way=4;
    }
    public double run(){
        return num1*num2;
    }
    @Override
    public String toString(){
        if(way==1){
            return "("+num1+"*"+num2+")";
        }
        if(way==2){
            return "("+op1+"*"+num2+")";
        }
        if(way==3){
            return "("+num1+"*"+op2+")";
        }
        else{
            return "("+op1+"*"+op2+")";
        }
    }
}
