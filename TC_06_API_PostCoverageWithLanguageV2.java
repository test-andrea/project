package api;

import org.codacy.framework.BaseTest;
import org.codacy.pages.api.post.PostCoverage;
import org.testng.annotations.Test;


public class TC_06_API_PostCoverageWithLanguageV2 extends BaseTest {

    @Test
    public void tc06APIPostCoverageV2() {

        PostCoverage postCoverage = new PostCoverage(testEnvironment);
        postCoverage.postCoverageWithLanguageV2();

    }
}
