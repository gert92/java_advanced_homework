package task9;

import java.util.Arrays;

public enum TemperatureConvert implements Convertable {
    C_F("Celsius", "Fahrenheit"){
        @Override
        public float convert(float tempIn) {
            return (tempIn * 9/5) + 32;
        }
    },
    C_K("Celsius", "Kelvin") {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15F;
        }
    },
    K_C("Kelvin", "Celsius"){
        @Override
        public float convert(float tempIn) {
            return tempIn - 273.15F;
        }
    },
    F_C("Fahrenheit", "Celsius"){
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5/9;
        }
    },
    F_K("Fahrenheit", "Kelvin"){
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) * 5/9 + 273.15F;
        }
    },
    K_F("Kelvin", "Fahrenheit"){
        @Override
        public float convert(float tempIn) {
            return (tempIn - 273.15F) * 9/5 + 32;
        }
    };

    private String input;
    private String output;

    TemperatureConvert(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public static float convertTemperature(String input, String output, float value ){
        System.out.println(Arrays.stream(values()).filter(n -> n.input.equals(input) && n.output.equals(output)).findFirst().get().convert(value));
        return Arrays.stream(values()).filter(n -> n.input.equals(input) && n.output.equals(output)).findFirst().get().convert(value);
    }

}
