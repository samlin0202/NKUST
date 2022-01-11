import java.util.*;

public class arrays {
        public static void main(String[] args) {
            Map<String,Integer> checkRepeatMap = new HashMap<>();
            List<String> num = new ArrayList<>();
            int firstNum = 0;
            num.add("0");
            num.add("0");
            num.add("1");
            num.add("1");
            num.add("1");
            num.add("2");
            num.add("2");
            num.add("3");
            num.add("3");
            num.add("4");

            for (int i = 0 ; i < num.size() ; i++){
                String getNum = num.get(i);                     //getNum拿取num裡的數值
                if (!checkRepeatMap.containsKey(getNum)){       //透過checkRepeatMap判斷數值是否重複
                    firstNum = firstNum + 1;          //並且firstNum +1
                }
                else{
                    num.set(i,"_");                             //重複的話將在num裡的該數替換成 _
                }
                checkRepeatMap.put(getNum,i);                   //將getNum的值放進checkRepeatMap，用於if判斷是否重複
            }
            Collections.sort(num);                              //整理outputResult
            System.out.println("nums = " + num);
            System.out.println("Output：" + firstNum);
        }
}
