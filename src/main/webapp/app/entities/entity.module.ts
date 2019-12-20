import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'bank-account-my-suffix',
        loadChildren: () =>
          import('./test-root/bank-account-my-suffix/bank-account-my-suffix.module').then(
            m => m.JhipsterSampleApplicationBankAccountMySuffixModule
          )
      },
      {
        path: 'label',
        loadChildren: () => import('./test-root/label/label.module').then(m => m.JhipsterSampleApplicationLabelModule)
      },
      {
        path: 'operation',
        loadChildren: () => import('./test-root/operation/operation.module').then(m => m.JhipsterSampleApplicationOperationModule)
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ]
})
export class JhipsterSampleApplicationEntityModule {}
