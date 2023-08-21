package com.example.softwareexaminationjava.practice_2023_up_1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * 力扣算法练习
 *
 * @author zhangyu18
 * @date 2023-08-21 12:45
 * @since ncc2005
 */
public class AlgorithmExerciseLeetCode {
    static class IndexedValue {
        int value;
        int index;

        public IndexedValue(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int maxArea(int[] height) {
        IndexedValue[] indexedValues = new IndexedValue[height.length];
        for (int i = 0; i < height.length; i++) {
            indexedValues[i] = new IndexedValue(height[i], i);
        }

        Arrays.sort(indexedValues, (t0, t1) -> {
            if(t0.value == t1.value){
                return Integer.compare(t1.index, t0.index);
            } else {
                return Integer.compare(t0.value, t1.value);
            }
        });
        int x;
        int y;
        int result = 0;
        for (int i = indexedValues.length - 2; i >= 0; i--) {
            x = Math.abs(indexedValues[indexedValues.length - 1].index - indexedValues[i].index);
            y = Math.min(indexedValues[i + 1].value, indexedValues[i].value);
            result = Math.max(result, x * y);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = AlgorithmExerciseLeetCode.class.getClassLoader().getResourceAsStream("enteringGinseng.json");
        JsonNode rootNode = objectMapper.readTree(inputStream);
        if (rootNode.isArray()) {
            int[] dataArray = new int[rootNode.size()];

            for (int i = 0; i < rootNode.size(); i++) {
                dataArray[i] = rootNode.get(i).asInt();
            }

            System.out.println(new AlgorithmExerciseLeetCode().maxArea(dataArray));
        }

    }
}
