package in.sanmu.antlr.pubsub;

/**
 * @author : wangsen
 * @version : 1
 * @date : 2020/3/20 17:22
 */
public abstract class BaseSubscriber {

    /**
     * actions on change.
     *
     * @param event event dispatched
     */
    abstract void onChange(Object event);

}
