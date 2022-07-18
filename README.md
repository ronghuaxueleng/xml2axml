# xml2axml

English | [中文](README_zh-CN.md)

Tool for encoding xml to axml OR decoding axml to xml

### Usage

#### xml to axml  
``` shell
java -jar xml2axml-1.0.jar e [AndroidManifest-readable-in.xml] [AndroidManifest-bin-out.xml]
```

#### axml to xml
``` shell
java -jar xml2axml-1.0.jar d [AndroidManifest-bin-in.xml] [AndroidManifest-readable-out.xml]
```

### Building

```bash
./gradlew executable
```

Will produce two outputs in `/build/libs`:
- `xml2axml.jar-1.0`
- `xml2axml` - a binary executable that can be run standalone