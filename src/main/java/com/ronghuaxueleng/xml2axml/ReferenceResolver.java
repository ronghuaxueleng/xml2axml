package com.ronghuaxueleng.xml2axml;

import com.ronghuaxueleng.xml2axml.chunks.ValueChunk;

public interface ReferenceResolver {
    int resolve(ValueChunk value, String ref);
}
