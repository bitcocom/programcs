package org.module;
// 배열처럼 동작하는 클래스
public class IntArray {
    private int[] arr; //int[] -> 정수
    private int size; // 원소의 개수? size=0
    public IntArray(){
        //arr=new int[10]; // 10 size 기본
        this(10); // IntArray(10)
    }
    public IntArray(int inital){ // 10 / 생성하는 동작
        arr=new int[inital]; // new int[10];
    }
    public void add(int data){ // 저장하는 동작
        arr[size++]=data; // arr[0]=data -> size=1
    }
    public int get(int index){ // 얻는 동작
        return arr[index]; // arr[2]
    }
    public int size(){ // 원소의 개수를 얻어오는 동작
        return size;
    }
}
