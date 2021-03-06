import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IOperation } from 'app/shared/model/test-root/operation.model';

@Component({
  selector: 'my-prefix-operation-detail',
  templateUrl: './operation-detail.component.html'
})
export class OperationDetailComponent implements OnInit {
  operation: IOperation | null = null;

  constructor(protected activatedRoute: ActivatedRoute) {}

  ngOnInit(): void {
    this.activatedRoute.data.subscribe(({ operation }) => {
      this.operation = operation;
    });
  }

  previousState(): void {
    window.history.back();
  }
}
