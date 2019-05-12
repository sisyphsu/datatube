package com.github.sisyphsu.nakedata.node.std;

import com.github.sisyphsu.nakedata.node.Node;
import com.github.sisyphsu.nakedata.type.DataType;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sulin
 * @since 2019-05-08 21:03:54
 */
@Getter
@Setter
public class NullNode extends Node {

    public final static NullNode INSTANCE = new NullNode();

    private NullNode() {
    }

    @Override
    public DataType getDataType() {
        return DataType.NULL;
    }

    @Override
    public boolean isNull() {
        return true;
    }

}