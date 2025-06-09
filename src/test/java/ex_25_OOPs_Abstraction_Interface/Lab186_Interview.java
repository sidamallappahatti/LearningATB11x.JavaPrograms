package ex_25_OOPs_Abstraction_Interface;

public class Lab186_Interview {

}
interface I11{}
interface I12{}
class C1{}
class C2{}
abstract class Siddu{
    abstract void S();
}
class test1 extends C1{}
//class test2 extends C1,C2{}// Multiple inheritance in class os not allowed
class test3 implements I11{}
class test4 implements I11,I12{}
//class Test5 implements I11 extends C1{}
//interface I13 extends C2{}
interface i14{}