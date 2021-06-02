package study.ascii92der.lotto.step3n4;

import java.util.*;

public class Lotto {
    public static final int LOTTO_NUMBER_VALID_COUNT = 6;

    public static final String ERROR_MASSAGE_WRONG_NUMBER_COUNT = "Lotto Number count is wrong";
    public static final String ERROR_MASSAGE_DUPLICATE_NUMBER = "This Numbers has duplicate number";

    private final List<LottoNumber> lottoNumbers;

    public Lotto(List<Integer> lotto) {

        lottoNumbers = new ArrayList<>();
        lotto.stream().map(LottoNumber::new).forEach(lottoNumbers::add);

        validNumberCount();
        validDuplicateNumber();
    }

    private void validNumberCount() {
        if (this.lottoNumbers.size() != LOTTO_NUMBER_VALID_COUNT) {
            throw new IllegalArgumentException(ERROR_MASSAGE_WRONG_NUMBER_COUNT);
        }
    }

    private void validDuplicateNumber() {
        Set<LottoNumber> lottoNumberSet = new HashSet<>(lottoNumbers);
        if (lottoNumberSet.size() != this.lottoNumbers.size()) {
            throw new IllegalArgumentException(ERROR_MASSAGE_DUPLICATE_NUMBER);
        }
    }

    public boolean hasNumber(int value) {
        return lottoNumbers.contains(new LottoNumber(value));
    }
}
