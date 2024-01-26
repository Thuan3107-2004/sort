/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sort;

/**
 *
 * @author admin
 */

import java.util.Scanner;

public class Sort {
    private int[]a;
    private int n;
    
    public Sort(int[]a, int n){
        this.a=a;
        this.n=n;
    }
    public void BubbleSort(){
        for(int i = n-1; i > 0; i--){
            boolean cont=true;
            for(int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    cont=false;
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            if(cont)return ;
        }
        
    }
    private void qs(int a[], int f, int l){
        int p = a[(f+l)/2], i = f, j = l;
        while(i < j){
            while(a[i]<p)i++;
            while(a[j]>p)j--;
            if(i<=j){
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        if(i<l)qs(a, i, l);
        if(j>f)qs(a, f, j);
    }
    
    public void quickSort(){
        qs(a, 0, n -1);
    }
    public void print(){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[] args) 
    {
        System.out.println("nhap so phan tu can sap xep");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        
        for(int i = 0; i < n;i++){
            a[i]=sc.nextInt();
        }
        Sort s1 = new Sort(a, n);
        System.out.println("so sau khi sap xep la");
        s1.quickSort();
        s1.print();
    }
}
