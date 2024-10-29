package com.ganesh.sai;

import java.util.Collections;
import java.util.List;


public class CompareTwoList {


    public void compareList(List<String>list, List<String> equalList){
    Collections.sort(list);
    Collections.sort(equalList);
      list.equals(equalList);
    
    }
    
}
