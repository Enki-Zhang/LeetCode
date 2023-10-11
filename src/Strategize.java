/**
 * @author Enki
 * @ClassName Test
 * @Description: TODO
 * @Date 2023/10/6 15:11
 * @Version 1.0
 */
// functional/Strategize.java

interface Strategy {
    //    接口实现函数式的功能
    String approach(String msg);
}

/**
 * 通过不同的接口实现不同的功能
 */
class Soft implements Strategy {
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        strategy = new Soft(); // [1]
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() { //1
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg -> msg.substring(0, 5), // [3]
                Unrelated::twice // [4]
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy); // [5]
            s.communicate(); // [6]
        }
    }
}

