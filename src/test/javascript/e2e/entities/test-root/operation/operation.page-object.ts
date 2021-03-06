import { element, by, ElementFinder } from 'protractor';

export class OperationComponentsPage {
  createButton = element(by.id('jh-create-entity'));
  deleteButtons = element.all(by.css('my-prefix-operation div table .btn-danger'));
  title = element.all(by.css('my-prefix-operation div h2#page-heading span')).first();

  async clickOnCreateButton(): Promise<void> {
    await this.createButton.click();
  }

  async clickOnLastDeleteButton(): Promise<void> {
    await this.deleteButtons.last().click();
  }

  async countDeleteButtons(): Promise<number> {
    return this.deleteButtons.count();
  }

  async getTitle(): Promise<string> {
    return this.title.getAttribute('jhiTranslate');
  }
}

export class OperationUpdatePage {
  pageTitle = element(by.id('my-prefix-operation-heading'));
  saveButton = element(by.id('save-entity'));
  cancelButton = element(by.id('cancel-save'));
  dateInput = element(by.id('field_date'));
  descriptionInput = element(by.id('field_description'));
  amountInput = element(by.id('field_amount'));
  bankAccountSelect = element(by.id('field_bankAccount'));
  labelSelect = element(by.id('field_label'));

  async getPageTitle(): Promise<string> {
    return this.pageTitle.getAttribute('jhiTranslate');
  }

  async setDateInput(date: string): Promise<void> {
    await this.dateInput.sendKeys(date);
  }

  async getDateInput(): Promise<string> {
    return await this.dateInput.getAttribute('value');
  }

  async setDescriptionInput(description: string): Promise<void> {
    await this.descriptionInput.sendKeys(description);
  }

  async getDescriptionInput(): Promise<string> {
    return await this.descriptionInput.getAttribute('value');
  }

  async setAmountInput(amount: string): Promise<void> {
    await this.amountInput.sendKeys(amount);
  }

  async getAmountInput(): Promise<string> {
    return await this.amountInput.getAttribute('value');
  }

  async bankAccountSelectLastOption(): Promise<void> {
    await this.bankAccountSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async bankAccountSelectOption(option: string): Promise<void> {
    await this.bankAccountSelect.sendKeys(option);
  }

  getBankAccountSelect(): ElementFinder {
    return this.bankAccountSelect;
  }

  async getBankAccountSelectedOption(): Promise<string> {
    return await this.bankAccountSelect.element(by.css('option:checked')).getText();
  }

  async labelSelectLastOption(): Promise<void> {
    await this.labelSelect
      .all(by.tagName('option'))
      .last()
      .click();
  }

  async labelSelectOption(option: string): Promise<void> {
    await this.labelSelect.sendKeys(option);
  }

  getLabelSelect(): ElementFinder {
    return this.labelSelect;
  }

  async getLabelSelectedOption(): Promise<string> {
    return await this.labelSelect.element(by.css('option:checked')).getText();
  }

  async save(): Promise<void> {
    await this.saveButton.click();
  }

  async cancel(): Promise<void> {
    await this.cancelButton.click();
  }

  getSaveButton(): ElementFinder {
    return this.saveButton;
  }
}

export class OperationDeleteDialog {
  private dialogTitle = element(by.id('my-prefix-delete-operation-heading'));
  private confirmButton = element(by.id('my-prefix-confirm-delete-operation'));

  async getDialogTitle(): Promise<string> {
    return this.dialogTitle.getAttribute('jhiTranslate');
  }

  async clickOnConfirmButton(): Promise<void> {
    await this.confirmButton.click();
  }
}
