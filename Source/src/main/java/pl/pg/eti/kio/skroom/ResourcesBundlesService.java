package pl.pg.eti.kio.skroom;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ResourcesBundlesService {

	public List<String> getJqueryUiStyleBundle() {
		return Arrays.asList("resources/base/jquery.ui.core.css",
				"resources/base/jquery.ui.resizable.css",
				"resources/base/jquery.ui.selectable.css",
				"resources/base/jquery.ui.accordion.css",
				"resources/base/jquery.ui.autocomplete.css",
				"resources/base/jquery.ui.button.css",
				"resources/base/jquery.ui.dialog.css",
				"resources/base/jquery.ui.slider.css",
				"resources/base/jquery.ui.tabs.css",
				"resources/base/jquery.ui.datepicker.css",
				"resources/base/jquery.ui.progressbar.css",
				"resources/base/jquery.ui.theme.css");
	}
	
	public void attachBundlesToModel(ModelAndView model) {
		model.addObject("jqueryUiStyleBundle", getJqueryUiStyleBundle());
	}

}
