package gfg.strings;

public class BuildInMethods {

/*
====================================================================================
============  JAVA STRING IMPORTANT IN-BUILT METHODS (INTERVIEW NOTES)  ============
====================================================================================

=> Length & Basic Info

    length() -> returns length of string
    isEmpty() -> true if length == 0
    isBlank() -> true if string has only whitespaces (Java 11+)
    charAt(int index) -> returns character at index
    toCharArray() -> converts string to char array

    Difference:
    isEmpty() -> ""
    isBlank() -> " "

=>  Comparison Methods (VERY IMPORTANT)

    equals(Object obj) -> content comparison
    equalsIgnoreCase(String str) -> ignores case
    compareTo(String str) -> lexicographical comparison
    compareToIgnoreCase(String str)

    Note:
    Never use '==' for string comparison (compares references).

=>  Searching & Indexing

    contains(CharSequence s)
    startsWith(String prefix)
    endsWith(String suffix)

    indexOf(int ch)
    indexOf(String str)
    indexOf(String str, int fromIndex)

    lastIndexOf(String str)

    Substring & Extraction

    substring(int beginIndex)
    substring(int beginIndex, int endIndex)

=>  Note:
    beginIndex -> inclusive
    endIndex -> exclusive

=>  Case Conversion

    toUpperCase()
    toLowerCase()

=> Replace & Modify

    replace(char oldChar, char newChar)
    replace(CharSequence target, CharSequence replacement)

    replaceAll(String regex, String replacement)
    replaceFirst(String regex, String replacement)

=>  Difference:
    replace() -> literal replacement
    replaceAll() -> regex based

=> Trim & Whitespace Handling

    trim() -> removes leading & trailing spaces
    strip() -> Unicode aware (Java 11+)
    stripLeading()
    stripTrailing()

=>  Split & Join

    split(String regex)
    split(String regex, int limit)

   String.join(CharSequence delimiter, elements)

=> Conversion & Value Methods

    valueOf(int i)
    valueOf(double d)
    valueOf(boolean b)
    valueOf(Object obj)

    toString()

    Regex Matching

    matches(String regex)

=>  Note:
    matches() checks FULL string, not partial.

=>  Encoding & Bytes

    getBytes()
    getBytes(Charset charset)

    Used in files, networking, Kafka, encryption.


===============================================================================================
========================  Memory & String Pool (ADVANCED)  ====================================
===============================================================================================

    intern() -> moves string to String Constant Pool

    Utility / Less Common but Useful

    concat(String str)
    repeat(int count) -> Java 11+
    lines() -> Java 11+

================================================================================================
    INTERVIEW MUST-KNOW DIFFERENCES
================================================================================================

        == vs equals()

        isEmpty() vs isBlank()

        replace() vs replaceAll()

        trim() vs strip()

        substring() index rules

        String immutability*/

//===============================================================================================
}
