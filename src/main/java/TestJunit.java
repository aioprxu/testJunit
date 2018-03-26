

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/3/19.
 */
public class TestJunit {
    int array [];
    public TestJunit(int array []){
        this.array=array;
    }
    public int max(){
        if(array == null || (array.length == 1 && array[0] <= 0)||array.length==0)
        return 0;

        int cur = array[0];
        int sum = array[0];
        for(int i = 1;i < array.length;i++){
            if(cur < 0)
                cur = 0;
            cur = cur + array[i];
            if(sum <= cur)
                sum = cur;
        }
        return sum;
    }
}

