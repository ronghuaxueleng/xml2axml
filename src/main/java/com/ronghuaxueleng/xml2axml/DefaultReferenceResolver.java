package com.ronghuaxueleng.xml2axml;

import com.ronghuaxueleng.xml2axml.chunks.ValueChunk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultReferenceResolver implements ReferenceResolver {
    static Pattern pat = Pattern.compile("^@\\+?(?:(\\w+):)?(?:(\\w+)/)?(\\w+)$");

    public int resolve(ValueChunk value, String ref) {
        Matcher m = pat.matcher(ref);
        if (!m.matches()) throw new RuntimeException("invalid reference");
        String pkg = m.group(1);
        String type = m.group(2);
        String name = m.group(3);
        try {
            return Integer.parseInt(name, Encoder.Config.defaultReferenceRadix);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value.getContext().getResources().getIdentifier(name, type, pkg, false);

    }
}
