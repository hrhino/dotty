
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package dotty.runtime.function;

import scala.MatchError;

@FunctionalInterface
public interface JFunction7<T1, T2, T3, T4, T5, T6, T7, R> extends scala.Function7<T1, T2, T3, T4, T5, T6, T7, R>, java.io.Serializable {
    default void $init$() {
    };

    @SuppressWarnings("unchecked")
    default scala.Function1<T1, scala.Function1<T2, scala.Function1<T3, scala.Function1<T4, scala.Function1<T5, scala.Function1<T6, scala.Function1<T7, R>>>>>>> curried() {
        throw new UnsupportedOperationException("todo");
    }

    @SuppressWarnings("unchecked")
    default scala.Function1<scala.Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> tupled() {
        throw new UnsupportedOperationException("todo");
    }


}
