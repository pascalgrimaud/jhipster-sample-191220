import { element, by } from 'protractor';

export class LabelComponentsPage {
  title = element.all(by.css('my-prefix-label div h2#page-heading span')).first();

  async getTitle(): Promise<string> {
    return this.title.getAttribute('jhiTranslate');
  }
}
