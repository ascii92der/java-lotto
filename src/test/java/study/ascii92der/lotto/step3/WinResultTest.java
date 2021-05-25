package study.ascii92der.lotto.step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinResultTest {

    @Test
    @DisplayName("3개 일치 값 저장")
    void saveMatchLottoNumberThreeTest() {
        WinResult winResult = new WinResult();

        winResult.saveWinResult(LottoWinner.FOURTH);
        winResult.saveWinResult(LottoWinner.FOURTH);
        winResult.saveWinResult(LottoWinner.FOURTH);

        assertThat(winResult.result(LottoWinner.FOURTH)).isEqualTo(winResult.result(LottoWinner.FOURTH));
    }

    @Test
    @DisplayName("4개 일치 값 저장")
    void saveMatchLottoNumberFourTest() {
        WinResult winResult = new WinResult();

        winResult.saveWinResult(LottoWinner.THIRD);
        winResult.saveWinResult(LottoWinner.THIRD);

        assertThat(winResult.result(LottoWinner.THIRD)).isEqualTo(winResult.result(LottoWinner.THIRD));
    }

    @Test
    @DisplayName("5개 일치 값 저장")
    void saveMatchLottoNumberFiveTest() {
        WinResult winResult = new WinResult();

        winResult.saveWinResult(LottoWinner.SECOND);
        winResult.saveWinResult(LottoWinner.SECOND);
        winResult.saveWinResult(LottoWinner.SECOND);
        winResult.saveWinResult(LottoWinner.SECOND);
        winResult.saveWinResult(LottoWinner.SECOND);

        assertThat(winResult.result(LottoWinner.SECOND)).isEqualTo(winResult.result(LottoWinner.SECOND));
    }

    @Test
    @DisplayName("6개 일치 값 저장")
    void saveMatchLottoNumberSixTest() {
        WinResult winResult = new WinResult();

        winResult.saveWinResult(LottoWinner.FIRST);

        assertThat(winResult.result(LottoWinner.FIRST)).isEqualTo(winResult.result(LottoWinner.FIRST));
    }
}
