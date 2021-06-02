package study.ascii92der.lotto.step3n4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoResultTest {

    @Test
    @DisplayName("일치되는 로또 번호 계산")
    void lottoMatchedNumberTest() {
        List<Integer> lottoNumbers = new ArrayList<>(Arrays.asList(23,3,4,5,6,44));
        LottoResult lottoResult = new LottoResult(new Lotto(lottoNumbers),
                new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6")),23);
        assertThat(lottoResult.result()).isEqualTo(LottoWinner.FOURTH);
    }
}
