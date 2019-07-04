package com.github.sisyphsu.nakedata.node.array.primary;

import com.github.sisyphsu.nakedata.node.Node;
import com.github.sisyphsu.nakedata.type.DataType;

/**
 * byte[] array
 *
 * @author sulin
 * @since 2019-05-08 21:01:31
 */
public class BArrayNode extends Node {

    private byte[] items;

    private BArrayNode(byte[] items) {
        this.items = items;
    }

    public static BArrayNode valueOf(byte[] data) {
        if (data == null || data.length == 0) {
            throw new IllegalArgumentException("data can't be null or empty");
        }
        return new BArrayNode(data);
    }

    public byte[] getItems() {
        return items;
    }

    @Override
    public DataType dataType() {
        return DataType.ARRAY;
    }

    @Override
    public boolean isNull() {
        return false;
    }

}