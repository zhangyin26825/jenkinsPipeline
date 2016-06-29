import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by yin on 2016/6/28.
 */
public class Test {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList(
//                "blue", "red", "green", "yellow", "orange", "cyan", "purple"
//        );
//        Observable<String> listObservable = Observable.from(list);
//        listObservable.subscribe(System.out::println);
        Observable
                .just('R', 'x', 'J', 'a', 'v', 'a')
                .subscribe(
                        System.out::print,
                        System.err::println,
                        System.out::println
                );


    }
}
