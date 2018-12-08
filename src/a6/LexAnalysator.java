package a6;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LexAnalysator {

    public static void main(String[] args) {
        y.put('a', "Z1");
        y.put('a', "Z1");
        y.put('a', "Z1");
        x.put("a", y);
        x.put("b", y);
        x.put("c", y);

        System.out.println(x.get("b").put('a', "x!"));
        System.out.println(x.get("b").get('a'));
    }

    private static HashMap<String, HashMap<Character, String>> x = new HashMap<>();
    private static HashMap<Character, String> y = new HashMap<>();

    public String automat(List<String> stringList, HashMap<String[], HashMap<String, String>> table) {
        String[] state = {"",""};
        state[0] = table.keySet().stream().filter(x -> x[1].equals("_start")).collect(Collectors.toList()).get(0)[0];
        for (String str : stringList) {

            state[0] = table.entrySet()
                    .stream()
                    .filter(x -> x.getKey()[0].equals(state[0]))
                    .collect(Collectors.toList())
                    .get(0)
                    .getValue()
                        .entrySet()
                        .stream()
                        .filter(x -> x.getKey().equals(str))
                        .collect(Collectors.toList())
                        .get(0)
                        .getValue();

            if (state[0] == "\u03A9") return "Error";
        }
        state[1] = table.keySet().stream().filter(x -> x[0].equals(state[0])).collect(Collectors.toList()).get(0)[1];
        if (state[1] == "_end") return "Sucess";
        else return "Error";
    }

}


//    void dfa (char *in) {
//        s = in;
//        state = start_state;
//        while(1) {
//            c = *s++;
//            state = table[state][c];
//            if (final[state)]) {
//                printf(“Accepted %s\n”,in);
//                break;
//            }
//        }
//    }