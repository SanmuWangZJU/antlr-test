package in.sanmu.antlr.pubsub;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author : wangsen
 * @version : 1
 * @date : 2020/3/20 17:18
 */
public class EventHub {

    private static final Map<Class<?>, Set<BaseSubscriber>> typedSubscribers = new HashMap<>();

    private static final Map<Class<?>, LinkedBlockingQueue<Object>> typedEventQueue = new HashMap<>();

    public boolean register(Class<?> clz, Object ownerObject) {
        return true;
    }

    public boolean unregister() {
        return true;
    }

    public void post(Object event) {

    }

    private boolean dispatch() {
        return false;
    }

}
