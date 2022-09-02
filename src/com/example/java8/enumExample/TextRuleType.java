package com.example.java8.enumExample;

public enum TextRuleType {
    TEXT_COMPARISON("TextComparison"), TEXT_DOC_MATCH("TextDocComparison"), DOCS_MATCH("DocsComparison");

    private String value;

    private String getValue(){
        return this.value;
    }

    TextRuleType(String textComparison) {
        this.value = textComparison;
    }
}
