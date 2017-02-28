package org.yuwt.selenium;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;

/**
 * Created by yuwt on 2017/2/28.
 */
@Config(
	browser = Browser.CHROME,
	url = "http://seleniumhq.org"
)
public class SeleniumHQTest extends Locomotive{
	@Test
	public void test_download_link_exists() {
		validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);
	}

	@Test
	public void test_tabs_exist() {
		validatePresent(HomePage.LOC_LNK_PROJECTSTAB)
		.validatePresent(HomePage.LOC_LNK_DOWNLOADTAB)
		.validatePresent(HomePage.LOC_LNK_DOCUMENTATIONTAB)
		.validatePresent(HomePage.LOC_LNK_SUPPORTTAB)
		.validatePresent(HomePage.LOC_LNK_ABOUTTAB);
	}
}
