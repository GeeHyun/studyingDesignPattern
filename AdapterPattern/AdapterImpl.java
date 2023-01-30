public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        // Math.towTime의 입출력값은 double
        // return (float) Math.twoTime(f.doubleValue());
        // 강화된 알고리즘
        // Main이나 Adapter를 수정하지 않고 수정 가능
        return Math.doubled(f.doubleValue()).floatvalue();
    }

    @Override
    public Float halfOf(Float f) {
        // Main, Math(소스), Adapter 대신 이부분을 수정
        System.out.println("절반 함수 시작");
        return (float) Math.half(f.doubleValue());
    }

}