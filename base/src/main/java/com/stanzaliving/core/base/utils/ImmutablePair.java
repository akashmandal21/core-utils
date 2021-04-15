package com.stanzaliving.core.base.utils;

public class ImmutablePair<U, V> {

    final U key;		//you may remove final if non-immutable needed
    final V value;

    public ImmutablePair(U key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <U, V> ImmutablePair<U, V> of(final U key, final V value) {
        return new ImmutablePair(key, value);
    }

    public U getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public U getLeft(){
        return key;
    }

    public V getRight(){
        return value;
    }

    public U getFirst(){
        return key;
    }

    public V getSecond(){
        return value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImmutablePair<?, ?> pair = (ImmutablePair<?, ?>) o;
        if (!key.equals(pair.key))
            return false;
        return value.equals(pair.value);
    }

    @Override
    public int hashCode()
    {
        return 31 * key.hashCode() + value.hashCode();
    }

    @Override
    public String toString()
    {
        return "(" + key + ", " + value + ")";
    }
}

