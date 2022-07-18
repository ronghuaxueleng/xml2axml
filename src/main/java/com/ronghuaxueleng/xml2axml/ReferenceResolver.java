package com.ronghuaxueleng.xml2axml;

import com.ronghuaxueleng.xml2axml.chunks.ValueChunk;

/**
 * Created by Roy on 15-10-5.
 */
public interface ReferenceResolver {
    int resolve(ValueChunk value, String ref);
}
