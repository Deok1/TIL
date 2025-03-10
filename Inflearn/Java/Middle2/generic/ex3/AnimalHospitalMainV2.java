package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        // 자바는 T가 어떤게 들어올지 모르기 때문에 Object 타입으로 가정한다.
        // 따라서 모든 객체가 들어올 수 있다.
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
