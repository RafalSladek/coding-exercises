package com.rafalsladek.arraysAndStrings;

import java.util.LinkedHashMap;
import java.util.Map;

class StringCompression {

    /**
     * Big O(n)
     * Generate compressed string from input
     *
     * @param input
     * @return compressed string if it is shorter then input, otherwise input.
     */
    static String stringCompression(final String input) {

        LinkedHashMap<CharAndPosition, Integer> linkedHashMap = new LinkedHashMap<>();
        char[] array = input.toCharArray();

        CharAndPosition previous = null;
        CharAndPosition current;

        for (int i = 0; i < array.length; i++) {
            current = new StringCompression().new CharAndPosition(String.valueOf(array[i]), i);
            if (previous == null || !current.getValue().equals(previous.getValue())) {
                linkedHashMap.put(current, 1);
                previous = current;
            } else {
                linkedHashMap.put(previous, linkedHashMap.get(previous) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<CharAndPosition, Integer> entry : linkedHashMap.entrySet()) {
            sb.append(entry.getKey().getValue());
            sb.append(entry.getValue());
        }
        String compressed = sb.toString();
        return input.length() > compressed.length() ? compressed : input;
    }

    private class CharAndPosition implements Map.Entry<String, String> {

        private final String _characterAndPosition;
        private String _character;

        private CharAndPosition(String character, Integer position) {
            _characterAndPosition = character + position;
            _character = character;
        }

        @Override
        public String getKey() {
            return _characterAndPosition;
        }

        @Override
        public String getValue() {
            return _character;
        }

        @Override
        public String setValue(String value) {
            _character = value;
            return _character;
        }
    }

}

